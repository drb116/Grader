# compile and test a set of documents from a given directory
 

# Note: When entering the path, include a \ at the end of the final path
# Jar file should be in the same directory as the script.

$path= Read-Host -Prompt 'Please specify the location of the test files: '
$testjar = Read-Host -Prompt 'Please specify the name of the testing jar: '

$classMateFile = $path + "classname.txt"
$search = "$path" +"*.java"
$classpath = $testjar + ";" + $path


[array]$files=Get-ChildItem $search | select -expand BaseName

 
$outfile = "results.txt"
echo "$(Get-Date)" > $outfile

#echo $files.length >> $outfile
for ($i=0; $i -lt $files.length; $i++) {
	#echo $files[$i] > $classMateFile
	$fileshort = $path + $files[$i]
	$filefull = $fileshort + ".java"
	javac -cp $classpath $filefull
	java -cp $classpath $files[$i] >> $outfile
}

 