# UCSB Events Calendar

A web app that scrapes data of events from multiple UCSB websites to put them all into one easy to view calendar. You will be 
able to separate them by categories, and dates & times that work for the visitor. There is also a submit event page where you can 
submit your own event to be added to the calendar. To see more information for this webapp or news on recent updates, visit the FAQ page. 

## Getting Started

This project uses Maven 4.0.0, Java 1.8.0_181, Springboot 2.0.5, Heroku 2.0.3, and GitHub. Deploy the website via Heroku and you can find the

Our deployed website here: https://ucsb-events-calendar.herokuapp.com/

You can find the github main branch here: https://github.com/ucsb-cs56-f18/ucsb-cs56-events-calendar

Heroku dashboard: https://dashboard.heroku.com/apps/ucsb-events-calendar

### Prerequisites

Download Maven here: https://maven.apache.org/download.cgi

Download Java here: https://www.java.com/en/download/

Springboot info: http://spring.io/

Heroku: https://www.heroku.com/


### Getting a test website

First make sure you cd into your root directory where you have your branch of the project

In your command prompt make sure you're logged into your affiliated heroku account and follow login instructions
```
$ heroku login
```
Then to deploy your code use the command
```
$ mvn spring-boot:run
```

You can find your test website at: http://localhost:8080

## Deployment

1. First make sure you're in your root directory and you're logged into your heroku account by using the command

    $ heroku login

2. Then on your command prompt use the command

    $ heroku create -insert-your-app-name-here-

3. Update your pom.xml at the top to have your app name you just created underneath the `<properties>` tag
```
  <properties>

    <my.app.name>your-app-name</my.app.name>

  </properties>
```

update you-app-name to the name of your app when you used the heroku create command

4. Then deploy your code with the command
```
    $ mvn package heroku:deploy
```
5. Then access your deployed site at:
https://your-app-name.herokuapp.com
It may take a few minutes!

## Built With

* [Spring Boot] (https://spring.io/projects/spring-boot) - The web framework used
* [Maven] (https://maven.apache.org/) - Dependency Management
* [Java] (https://www.java.com/en/download/) - The coding language used
* [Git] (https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) - The version control manager
* [Heroku] (https://devcenter.heroku.com/articles/heroku-cli) - The cloud platform used to host our application

## Contributing

When contributing to this repository please make sure you speak to your assigned cs56 instructor via the method your group
agrees on. Make sure to work on your own branch for your own issue and keep your code documented and easy to read. Please
add only useful features that add value and makes it easier for the user to reach their end goal. Every feature/addition
should be related to something on the kanban board in the projects tab of the github repository, if it is not,
Please add the appropiate user story and issue to the board.

## Versioning

**Currently unavaiable**

## Contributors

Mentor:
Scott Chow


Students:
Ronald Hoang, Ryan Gormley, Jeff Tellew, Frank Lee, Dean Narlock


## Acknowledgments

Shoutout to professor Conrad for being an enthusiastic professor and teaching us about Advanced Applications Programming
