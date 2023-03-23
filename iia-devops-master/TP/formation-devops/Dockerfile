# Pour compiler l'application Java, qui est un projet Maven
# Il faut Maven
# On alias l'image de "builder" qui créera un espace temporaire
FROM maven:3.8.5-openjdk-17 AS builder

# Se placer dans un répertoire
WORKDIR /app

# Copier les fichiers : sources & pom.xml
COPY pom.xml .
COPY src/ src/

# Compiler le projet Java
RUN mvn package

# On crée une nouvelle image à partir de OpenJDK
FROM openjdk:17-bullseye

# Se placer dans /app
WORKDIR /app

# On va chercher le fichier JAR créé dans le builder
# On en profite pour le renommer
COPY --from=builder /app/target/*.jar formation-devops.jar

# Exécuter le projet Java
CMD [ "java", "-jar", "formation-devops.jar" ]

# On expose le port 8080
EXPOSE 8080