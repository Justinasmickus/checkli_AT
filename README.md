# Checkli Automation Test


#### Reference: https://www.checkli.com/
## Description:
#### Automated tests for three chosen scenarios for [Checkli](https://www.checkli.com/):
* Unregistered checklist
* Registration with invalid input fields
* Creating a new folder with an existing user

## Technologies:
* JAVA/Maven
#### Dependencies:
* testNg
* Selenium
* Webdriver manager


# Test Scenarios:

### 1.Unregistered checklist 

* Enter title
* Enter description
* Enter checklist item
* Submit checklist item


### 2. Registration with invalid input fields
#### A. Register using empty input fields

* Locate and leave blank input fields
* Check Terms and conditions box
* Submit registration form


#### B. Register using an existing user email
* Enter name
* Enter exisintg user email
* Check terms and conditions
* Submit registration form


### 3. Creating a new folder with an existing user
#### A. Login
* Enter email
* Enter password
* Submit login form

#### B.Create a new folder
* Select "New folder"
* Enter new folder's name
* Submit 
* Refresh browser

#### B.Logout
* Enter email
* Enter password
* Submit login form
* Locate and hover user avatar
* Select Logout 
