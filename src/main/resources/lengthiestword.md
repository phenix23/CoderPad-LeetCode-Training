## **Mot le plus long**

![img.png](img.png)
![img_1.png](img_1.png)

**Objectif** : Obtenir, à partir d'une chaîne de caractères en input, la première chaîne de caractère renvoyant le premier mot le plus long de la chaîne de caractère d'entrée.

**Exemple** : Si l'input est "Hello there", l'output sera "Hello".

## **Description de la fonction**

Compléter la fonction **findLengthiestWord** qui prend une chaîne de caractères comme paramètre d'entrée et renvoie le premier mot le plus long de la chaîne.

**Règles importantes** :

- Si plusieurs mots ont la même longueur maximale, renvoyer le mot qui vient en premier dans la chaîne d'entrée
- Les mots peuvent contenir des chiffres et des caractères spéciaux
- Ignorer tous les caractères spéciaux et signes de ponctuation **sauf l'underscore (_)**
- L'entrée ne sera jamais vide
- Si un caractère spécial se trouve au milieu d'un mot, diviser le mot à cet endroit

## **Exemples**

**Exemple 1** :

- Input : `"Come have lots of fun!! and frolick! gamers"`
- Output : `"frolic"`
- Explication : "frolic" et "gamers" ont tous deux 6 lettres, mais "frolic" vient en premier

**Exemple 2** :

- Input : `"Hello there, hope everything's is good"`
- Output : `"everything"`

## **Explication**

La string d'input est **"Come have lots of fun!! and frolic&! gamers"**. En ignorant les caractères spéciaux, on voit que **"frolic"** et **"gamers"** sont les mots les plus longs (longueur = 6). Cependant, puisque **"frolic"** vient en premier dans l'input, l'output sera donc **"frolic"**.

## **Exemple d'entrée**
```
1 Hello there, hope everything's is good  
```

## **Exemple d'output**
```
1 everything  
```

## **Explication détaillée**

La string d'input est **"Hello there, hope everything's good"**.

Ici, un caractère spécial **'** apparaît dans le mot **"everything's"**, donc ce mot sera divisé en **"everything"** et **"s"**.

Sur la base de cette codification et de l'input, nous pouvons voir que **"everything"** est le mot le plus long (longueur = 10) dans l'input.

Par conséquent, la sortie sera **"everything"**.

## **Packages utilisés** (pour Java)
```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
```

## **Résumé des règles importantes :**

1. **Ignorer les caractères spéciaux** (sauf underscore _)
2. **Diviser les mots** au niveau des caractères spéciaux
3. **Prendre le premier mot le plus long** en cas d'égalité
4. **L'apostrophe** divise le mot (ex: "everything's" → "everything" et "s")
5. **Les caractères &, !, ', etc.** servent de séparateurs