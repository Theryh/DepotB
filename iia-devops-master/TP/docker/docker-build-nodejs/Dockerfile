# On part de l'image node dans sa version 19-alpine
FROM node:19-alpine

# On se place, dans le container, dans le répertoire /app
WORKDIR /app

# On copie le fichier package.json dans le container
COPY package.json .

# On installe les dépendances NPM
RUN npm install

# On copie le répertoire src dans le container
COPY src/ src/

# On exposer le port 8080
EXPOSE 8080

# Au démarrage du container, cette commande s'exécutera
CMD [ "node", "src/server.js" ]