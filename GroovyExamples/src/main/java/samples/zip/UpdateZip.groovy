package samples.zip

groovy.grape.Grape.grab([group:'org.apache.ivy', module:'ivy', version:'2.0.0-beta1', conf:['default', 'optional']],
     [group:'org.apache.ant', module:'ant', version:'1.7.0'])

/**
 *
 * Extract zipFile into directory in temp, then call closure and give this directory as parameter to closure
 * (closure update this directory), then pack this directory back into ZipFile
 *  Nice method :) */
private void extractZipAndThenPackItBack(File zipFile, Closure closure) {
    def extractedDirectory
    try {
        //Extract
        extractedDirectory = getTempDir()
        ZipUtil.unpack(zipFile, extractedDirectory);

        //Call closure
        closure.call(extractedDirectory)
        //Pack result back
        zipFile.delete()
        ZipUtil.pack(extractedDirectory, zipFile);
    } finally {
        FileUtils.deleteDirectory(extractedDirectory)
    }
}

private File getTempDir() {
    def tmpDir = File.createTempFile("NSI_", "_betovatko")
    tmpDir.delete()
    tmpDir.mkdir()
    tmpDir
}