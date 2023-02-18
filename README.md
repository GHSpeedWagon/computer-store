# 🖥computer-store🖥
___
## 📄Short description
___Computer-store-app___ - it is a java web application that use Hibernate and Spring boot frameworks.
___
### 📑Full Description📑
Application can accept consoles, personal computer, laptops and save it to h2 in memory db.
(You can connect to db by "localhost:8080/h2-console" (properties in app.prop.))
User can add computer products to the shopping cart.
### 🛠Available endpoints🛠
___**General endpoint**___ - /movie/rick-and-morty
+ POST: /computers/add/{computer type}  <br /> - **for add new product to db** <br />
  **Example:** /computers/add/pc </br> - **for add new pc to db**
+ GET: /computers - **for get all products that extends computer class**</br>
+ GET: /shoppingCart </br> - **for get products you added to shopping cart**
+ GET: / or /index  <br /> - **for get all links with get method**
+ ___
+ ### Technologies used
| Technology  | Version |
|-------------|---------|
| JDK         | 18      |
| Spring boot | 3.0.2   |
| Maven       | 4.0.0   |
  | h2        |  latest|

### 💻🛠Local set up tutorial💻🛠
1. Fork and open this project
2. Upload all dependencies
3. Run application