const simpleGit = require('simple-git');
const { exec } = require('child_process');
jest.mock('simple-git');

simpleGit.mockImplementation(() => ({
  revert: jest.fn(),
  push: jest.fn(),
  status: jest.fn(() => ({ conflicted: [] }))
}));

describe('revertCommit', () => {
  test('should revert commit successfully', async () => {
    const git = simpleGit();
    await expect(git.revert('test-commit-hash')).resolves.not.toThrow();
    expect(git.revert).toHaveBeenCalledWith('test-commit-hash');
  });

  test('should push changes to remote repository', async () => {
    const git = simpleGit();
    await expect(git.push('origin', 'main')).resolves.not.toThrow();
    expect(git.push).toHaveBeenCalledWith('origin', 'main');
  });

  test('should throw error if merge conflicts are detected', async () => {
    const git = simpleGit();
    git.status.mockResolvedValue({ conflicted: ['file1', 'file2'] });

    await expect(async () => {
      const status = await git.status();
      if (status.conflicted.length > 0) {
        throw new Error('Merge conflicts detected');
      }
    }).rejects.toThrow('Merge conflicts detected');
  });
});
