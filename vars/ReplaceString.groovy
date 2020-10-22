def replaceString(String filename){
  def text = readFile file: filename
    text = text.replaceAll("%BUILD_NUMBER%", "${BUILD_NUMBER}")
    writeFile file: filename, text: text
}
