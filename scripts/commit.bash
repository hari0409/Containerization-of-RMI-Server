git add .
d=$(date)
echo "Enter commit changes: "
read -r content
git commit -m "$d-$content"
git push origin master