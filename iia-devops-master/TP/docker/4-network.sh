# Pour créer un nouveau réseau
docker network create --subnet 172.20.0.0/24 devops

# Pour vérifier sa création
docker network ls

# Pour vérifier sa configuration
docker network inspect devops

# Pour connecter le container "db" au réseau "devops" avec l'adresse IP 172.20.0.5
docker network connect --ip 172.20.0.5 devops db

# Pour vérifier la configuration du container
docker inspect db

# Pour connecter le container "jdk" au réseau "devops" avec l'adresse IP 172.20.0.10
docker network connect --ip 172.20.0.10 devops jdk

# Pour vérifier la configuration du container
docker inspect jdk

# Pour redémarrer les containers
docker start db
docker start jdk

# Pour vérifier que les containers sont bien démarrés
docker ps

# Se connecter au container "jdk"
# > Relancer la commande java pour exécuter le projet java
# > Nous avons une erreur de connexion au serveur SQL
docker exec -it jdk bash
cd /app/target
java -jar ......jar

# Sur Windows
# > Modifier le fichier application.properties pour adapter l'adresse IP et le port
# > Refaire un mvn package
mvn package

# Sur le container
# > Refaire l'exécution du projet java
java -jar ....jar

# Vérifier dans le navigateur
# > http://localhost:8080/api/produit
