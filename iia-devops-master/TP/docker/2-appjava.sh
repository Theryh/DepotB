# Créer le container openjdk:17-bullseye
# > Mapper le port 8080 sur le port 8080 du container
# > Mapper le répertoire du projet java sur le répertoire /app du container
# > Forcer openjdk à rester actif en utilisant la commande bash (garder un process actif)
docker run -it -d --name jdk -p 8080:8080 -v "C:/repertoire_projet_java":/app openjdk:17-bullseye bash

# Se connecter au container
docker exec -it jdk bash

# Pour vérifier la version du java
java -version

# Pour installer maven dans le container (si besoin)
apt update
apt install -y maven

# Soit sous Windows, soit dans le container (si installation de maven)
# > Se placer dans le répertoire du projet
# > Ca va générer le fichier JAR dans le répertoire target
mvn package

# Pour exécuter le fichier JAR
# > Se placer dans le répertoire target
java -jar fichier.jar