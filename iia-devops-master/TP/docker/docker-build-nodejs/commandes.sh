# Fabriquer l'image Docker
docker build -t nodedevops:latest .

# Vérifier que l'image existe bien (y'aura pas eu d'erreurs dans la commande build)
docker images

# Créer un container à partir de l'image
docker run -d --name node -p 5500:8080 nodedevops

# Vérifier que le serveur est démarré
docker logs node