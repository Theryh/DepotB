# Pour créer le container jenkins
docker run -d --name jenkins --network devops --ip 172.20.0.25 -p 8090:8080 jenkins/jenkins:jdk17

# Pour récupérer le mot de passe admin
docker exec -it jenkins bash
cat /var/jenkins_home/secrets/initialAdminPassword

# Générer clé SSH (sur le container) + laisser la localisation par défaut + choisir une PassPhrase
ssh-keygen

# Copier la clé publique (à copier sur le compte Github)
cat ~/.ssh/id_rsa.pub # ou cat /var/jenkins_home/.ssh/id_rsa.pub

# Copier la clé privée (à copier sur Jenkins)
cat ~/.ssh/id_rsa # ou cat /var/jenkins_home/.ssh/id_rsa

# Ajouter github.com à la liste des hôtes connus
ssh-keyscan github.com >> ~/.ssh/known_hosts
