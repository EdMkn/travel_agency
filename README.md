# Travel Agency project
Ce projet permet de déterminer les pays de destination dans lesquels l'écart de température est d'une valeur déterminée.
[![build workflow](https://github.com/EdMkn/travel_agency/actions/workflows/build.yml/badge.svg)](https://github.com/EdMkn/travel_agency/actions)
[![codecov](https://codecov.io/gh/EdMkn/travel_agency/branch/main/graph/badge.svg)](https://codecov.io/gh/EdMkn/travel_agency)

- Récupération de la liste des pays de destinations et des températures qu’il y fait en fonction des jours 

- Vérification que l’écart minimal de température donnée par le voyageur est respecté 

- Récupération de la liste de potentiels pays de destinations avec leurs écarts de températures 

## Build the project

The project requires a JDK 17 (recommended distribution is Temurin from [Adoptium](https://adoptium.net/)).

From there, simply use the Maven wrapper to launch all tests (unit tests & integration tests).

`./mvnw verify`

