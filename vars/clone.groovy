def clone(String url,String branch){
  echo "clone the git repo"
  git url: ${url} branch:${branch}
  echo "cloned repo succesfully"
}
