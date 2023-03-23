# Création du container
# > Avec la variable d'environnement qui autorise les mdp vides pour l'utilisateur root
docker run --name db -d -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -p 3308:3306 mysql:latest

# On peut utiliser client mysql
# > Avec l'utilisateur root
docker exec -it db mysql -uroot

# Pour afficher les bases de données
show databases;

# Pour créer une base de donneés
create database devops;