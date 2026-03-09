require('dotenv').config();
const simpleGit = require('simple-git');
const readline = require('readline');

const git = simpleGit();
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

async function revertCommit() {
  try {
    const remoteRepo = process.env.REMOTE_REPO_URL;
    if (!remoteRepo) {
      console.error('Error: REMOTE_REPO_URL is not defined in the environment.');
      process.exit(1);
    }

    // Prompt user for the commit hash
    rl.question('Enter the commit hash to revert: ', async (commitHash) => {
      try {
        console.log(`Reverting commit: ${commitHash}`);
        await git.revert(commitHash);

        console.log('Commit reverted successfully.');

        // Check for merge conflicts
        const status = await git.status();
        if (status.conflicted.length > 0) {
          console.log('Merge conflicts detected. Please resolve them manually.');
          console.log(`Conflicted files: ${status.conflicted.join(', ')}`);
          process.exit(1);
        }

        // Push changes to remote
        console.log('Pushing changes to remote repository...');
        await git.push('origin', 'main');
        console.log('Changes pushed successfully.');

      } catch (error) {
        console.error('Error during revert:', error.message);
      } finally {
        rl.close();
      }
    });
  } catch (error) {
    console.error('An unexpected error occurred:', error.message);
  }
}

revertCommit();
