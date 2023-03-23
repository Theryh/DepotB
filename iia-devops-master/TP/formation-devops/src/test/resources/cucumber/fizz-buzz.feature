# language: fr
Fonctionnalité: FizzBuzz
    Scénario: L'utilisateur converti un nombre en FizzBuzz
        Quand l'utilisateur converti de 1 à 1
        Alors il aura "1"

        Quand l'utilisateur converti de 2 à 2
        Alors il aura "2"

        Quand l'utilisateur converti de 3 à 3
        Alors il aura "Fizz"

        Quand l'utilisateur converti de 6 à 6
        Alors il aura "Fizz"

        Quand l'utilisateur converti de 5 à 5
        Alors il aura "Buzz"

        Quand l'utilisateur converti de 10 à 10
        Alors il aura "Buzz"

        Quand l'utilisateur converti de 15 à 15
        Alors il aura "FizzBuzz"

        Quand l'utilisateur converti de 30 à 30
        Alors il aura "FizzBuzz"

        Quand l'utilisateur converti de 1 à 2
        Alors il aura "12"

        Quand l'utilisateur converti de 1 à 3
        Alors il aura "12Fizz"

        Quand l'utilisateur converti de 1 à 5
        Alors il aura "12Fizz4Buzz"

        Quand l'utilisateur converti de 1 à 15
        Alors il aura "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz"