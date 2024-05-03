
# DS-CLIENT API
## API for customer registration

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring**


## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Jason02gabriel/api-dsclient.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**API CLIENT**
```markdown
POST /clients - Create a new customer
GET /clients - Retrieve all customer
GET /clients/{id} - Retrieve a customer by id
PUT /clients/{id} - Update a customer
DELETE /clients/{id} - Delete a customer by id
```

**BODY**
```json
{
  "name": "Gabriel",
  "cpf": "123.456.897-21",
  "income": 2000,
  "birth_Date": 2002-01-07,
  "children": 1
}
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.





