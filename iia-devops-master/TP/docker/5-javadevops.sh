# Fabriquer l'image
docker build -t javadevops:latest .

# Démarrer un nouveau container à partir de l'image
docker run -d --name java --network devops -p 5600:8080 javadevops