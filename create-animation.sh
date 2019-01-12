#!/bin/sh

NAME=$1

if [[ -z "$NAME" ]]; then
    echo "Usage of the script: './create-animation.sh <name>'"
    exit
fi

LOWER_NAME=`echo "$NAME" | tr '[:upper:]' '[:lower:]'`

find . -type f -exec sed -i '' -e "s/{{name}}/$NAME/g" {} 2>/dev/null \;
mv src/main/kotlin/nl/pvanassen/christmas/tree/animation/template/animation/TemplateState.kt src/main/kotlin/nl/pvanassen/christmas/tree/animation/template/animation/${NAME}State.kt
mv src/main/kotlin/nl/pvanassen/christmas/tree/animation/template/animation/Template.kt src/main/kotlin/nl/pvanassen/christmas/tree/animation/template/animation/$NAME.kt
mv src/main/kotlin/nl/pvanassen/christmas/tree/animation/template src/main/kotlin/nl/pvanassen/christmas/tree/animation/$LOWER_NAME
rm README.md
mv README-template.md README.md
rm -rf .git
git init
git add .
git commit -a -m "Initial commit"