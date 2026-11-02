# TP 5 : Invocation des méthodes sur des objets distants avec Java RMI

## Activité 5-1 : Service de conversion de devise

**Nom :** Masmoudi

**Prénom :** Ahmed

### Étape 2 : Développement du serveur

Dans cette étape, nous avons développé le serveur RMI `RMIConversion_Server`. Nous avons créé le package `rmiService` contenant l'interface distante `IConversion`, qui définit la méthode `convertirMontant()`, ainsi que la classe `ConversionImpl` qui implémente cette interface. Ensuite, nous avons créé le package `rmiServer` contenant la classe `ConversionServer`, chargée de démarrer l'annuaire RMIRegistry sur le port 1099, de créer une instance du service de conversion et de publier sa référence dans l'annuaire sous le nom `ConversionService`, afin de permettre aux clients d'accéder à distance à ce service.