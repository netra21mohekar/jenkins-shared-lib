def call(String url, String branch) {
    echo "Cloning the git repo..."
    git branch: branch, url: url
    echo "Cloned repo successfully!"
}
