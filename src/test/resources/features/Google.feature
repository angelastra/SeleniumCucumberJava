#Esto es un comentario en un feature
@google
Feature: Probar Funcionalidad de Google
Scenario Outline: Busco algo en Google
Given navego a Google
When busco <algo>
And click en boton de busqueda
Then obtengo resultados de <algo>

Examples:
    |   algo   |
    | Argentina|
    | México   |
    | Francia  |
    | España   |