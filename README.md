# Projekt Sklep Internetowy oparty na Mikroservisach

## Wprowadzenie

Ten projekt to aplikacja oparta na mikroserwisach, mająca na celu ocenę moich umiejętności w zakresie:
- Konteneryzacji
- Wielomodułowego projektu w Mavenie
- Tworzenia REST API
- Korzystania z bazy danych

## Przegląd Projektu

Projekt składa się z kilku mikroserwisów zbudowanych przy użyciu Spring Boot, które komunikują się ze sobą poprzez REST API i korzystają z bazy danych MYSQL.

### Mikroserwisy

1. **Customer Service**
    - Zarządza danymi o zapasach
    - Udostępnia endpointy REST do operacji CRUD
    - Korzysta z bazy danych PostgreSQL


## Technologie

- Spring Boot
- MYSQL
- Docker i Docker Compose
- Maven
- Swagger

## Uruchomienie

### Wymagania

- Java 17
- Maven 4.0.0 lub wyższy
- Docker i Docker Compose

### Budowanie Projektu

1. Sklonuj repozytorium:

    ```sh
    git clone ...
    ```

### Uruchamianie Projektu

Uruchom wszystkie serwisy za pomocą Docker Compose:

```sh
docker-compose up
