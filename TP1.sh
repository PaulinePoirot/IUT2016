#!/bin/bash

#lister les fichiers *.java:
find -name '*.java'

#compter les fichier *.java:
find -name '*.java' | wc -l

#liste les fichier et leur nb de ligne de code:
for f in '.*java'
do
	cat f | wc -l
done

#lister les 10 plus gros fichier *.java:
(find . -name \*.java -exec wc -l {} \;) | sort -n | tail -10

#compter le nb total de ligne:
cat file1.java | wc -l
