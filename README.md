# Kata Pairs
Le problème consiste à travailler avec une liste de n nombres aléatoires compris entre 1 et 9.

L'objectif est de compter combien de paires de nombres dans la liste, lorsqu'additionnées, donnent comme résultat 10. Chaque chiffre ne peut être utilisé qu'une seule fois dans une paire.

## Exemples
```
List<Integer> nombres = Arrays.asList(1, 3, 5, 7, 2, 8, 4, 6);

=> 3
```

Les paires qui satisfont la condition (somme égale à 10) sont (3, 7), (2, 8), et (4, 6).
Les chiffres 1 et 5 ne peuvent pas former de paires.

## Questions
Quelle est la complexité en temps et en espace de votre implémentation ?