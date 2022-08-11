
# Spring Reddit Clone

I am trying to replicate Reddit with the SpringBoot stack with Angular. I recently was trained in the language of Java so I am testing my knowledge and improve my capablities for projects in the future.




## Initial Setup

First things first, I used start.io.spring to intiate the SpringBoot Applications with several depenedicies. 
These depenedicies include Spring Data JPA, Lombok, Java Mail Sender, 
Spring Web, Spring Security, Validation and MySQL Driver.

After installing the project and importing into an IDE, I created some folders to hold the repository as well as the controller. 
After the folders are there, I created a Post entity to handle the information details. In this Post
class I made sure to Bean Validate so that I can see if theres an error with the user's input when
a user is inputting data. On the Post class, there is different relationships that require ManyToOne
which means that One user may have Many posts and One user may have Many subreddits. After the relationships
were established, I used the shortcut to generate the Setters and Getters.

After the Post class was done, I replicated the same thing with the Subbreddit Class with the relationships
and similar variables.

## Deployment

To deploy this project run

```bash
  npm run deploy
```


## Demo

Insert gif or link to demo


## Documentation

[Documentation](https://linktodocumentation)


## Authors

- [@Michael Bartek](https://www.github.com/Hoybaby)

