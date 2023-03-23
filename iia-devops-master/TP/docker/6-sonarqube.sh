# Pour créer le container sonarqube
docker run -d --name sonar -p 9000:9000 --network devops --ip 172.20.0.30 sonarqube:latest