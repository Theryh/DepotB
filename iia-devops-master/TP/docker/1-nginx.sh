
# Commande pour créer un container Docker "nginx"
docker run --name nginx -d -p 5000:80 nginx:latest

# Arrêter le container
docker stop nginx

# Supprimer le container
docker rm nginx

# Recréer le container en liant un volume
# > Créer un fichier "index.html"
# > Il faudra lier le volume à /usr/share/nginx/html
docker run --name nginx -d -p 5000:80 -v "C:/repertoire_html":/usr/share/nginx/html nginx:latest
