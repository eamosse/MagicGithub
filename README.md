# Prise en main des tests sur Android

Dans ce TP vous allez apprendre à manipuler les principaux éléments d'architecture d'une application
constuite selon le pattern MVVM. Particulièrement, vous allez observer l'utilisation des composants
tels que :

- ViewModel
- LiveData
- Repository
- RecyclerView
- Adapter

## Travaux à réaliser

### Configurez l'application

1. Cloner le projet sur Android Studio et modifier la section `Contributeurs` pour y ajouter les
   membres du groupe
2. Exécuter l'application et observer le comportement
3. Commit et push sur Github; que remarquez-vous ? Vous devriez avoir reçu un mail vous indiquant
   que les tests ont échoué

### Exécutez et fixer les tests

1. Exécuter les tests unitairs et corrigez les erreurs
5. Commit et push vos changements. Tout devrait être OK pour les tests.

### Finaliser l'application

1. Exécutez l'application et testez-la
2. Les images de profiles des utilisateurs ne sont pas affichées, pouvez-vous corriger cela?
3. Commit et push les derniers changements.

## Améliorer l'application
- Repérez les derniers TODO dans le code et essayez de les implémenter
- On va modifier le comportement du bouton supprimer de l'application pour qu'en cliquant sur le
  bouton delete :

1. On ne supprime plus l'utilisateur, mais on change son statut (activé <-> desactivé)
2. On met un background 'rouge' sur la cellule quand l'utilisateur est désactivé et blanc quand il
   est activé
3. On change le visuel du bouton delete : `poubelle` si l'utilisateur est activé et `restore` si
   l'utilisateur est désactivé
4. Finalement, quand on clique sur le bouton delete ou restore, on change le statut de l'utilisateur

5. Assurez-vous que les tests fonctionnent toujours et que l'application fonctionne correctement

## Bonus
- Ajouter un menu dans la toolbar qui permet de trier les utilisateurs par ordre alphabétique, par
  date de création ou par statut (activé ou désactivé)
# Contributeurs
