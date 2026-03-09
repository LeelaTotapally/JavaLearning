# Revert My Commits

This project automates the process of identifying and reverting git commits using their hashes. The tool helps in resolving merge conflicts, testing code integrity after the revert, and pushing the changes to the repository.

## Features
1. Identify commits to revert by their hashes.
2. Automate the revert process using `git revert <commit-hash>`.
3. Handle merge conflicts caused during the revert process.
4. Test the codebase automatically after reverting.
5. Push changes to the remote repository.

## Tech Stack
- Node.js

## Prerequisites
- Git installed on the system.
- A configured local and remote git repository.

## Installation
bash
npm install


## Usage
Run the application using:
bash
npm start

Follow the prompts to input the commit hash to revert.

## Environment Variables
Create a `.env` file in the root directory with the following:
env
REMOTE_REPO_URL=your_remote_repo_url


## Testing
Run:
bash
npm test


## License
MIT
