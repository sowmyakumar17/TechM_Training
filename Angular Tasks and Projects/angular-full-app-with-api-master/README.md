Routing

     http://localhost:4200/
	 http://localhost:4200/studio-------> /studio is resolved in server and if you 
	                               get new pages it is called server side routing
								   and the application becomes multipage
								   
								   /studio is resolved in browser itself without
								   loading new page but generating new content alone
								   client side routing
								   
				Client Side routing with angular
Top level or root level routes
----------------------------------

http://localhost:4200/about
http://localhost:4200/projects

here about and projects are top level routes

http://localhost:4200/projects/ai
http://localhost:4200/projects/budget

   here ai and budget are child routes of main route projects


### Services

 Service is an angular feature that usually contains some reusable functions
 that can be used across multiple components

 A Service are typescript classes which could be instantiated by using the concept of 
 dependency injection (constructor injection)

 By default services are singleton(only one object is created and the same object
 is injected everywhere)

 But if you want a new object everytime you can demand it by following some configuration 
```
 @Injectable()
 class DataService {



 }
```
 component
```
 @Component
 class DataComponent{

    constructor(private ds:DataService ){}  object will be injected

 }

suppose if you dont want singleton you want a fresh new object

@Component(
  provider: [DataService]

)

class DataComponent 
{

    constructor(private ds:DataService ){}  object will be injected (not singleton)

}

```


### Http API Calls

To make Http API calls angular supports a module called as HttpClientModule
in HttpClientModule we have a service called HttpClient using which 
we can call get GET,POST,PUT,DELETE and all other http methods

and all these methods returns Observable object (RxJS module)

What is Observable?

   Observable is an important object in RXjs that could be
   subsribed for asynchronous result from an function which
   deals with asynchronous logic


   result = http.get("http://localhost:4500/contacts")

   result is observable

   result.subscribe(
     {
        next: (data) => console.log(data),
        error: (error)=>console.log(error)
     }
   )

   ## Form Handling 

   To handle forms in Angular

   There are two approaches

   * Template based approach
   * Model based approach

#### Template based approach
  
  In this approach, we follow a straight forward way to handle forms
  There is no inbuild validation support
  We have to handle it ourselves
  We use FormsModule for this
  and the directive ngModel is used to handle form fields


### Model Based Approach

 In Model based approach

 We use a a module called ReactFormsModule
 To handle bigger Forms with proper Structure and model
 If you have things like nested form, dynamice form etc we can use
 this approach
 This approach supports Inbuilt validation
 We use Formbuilder to build the modal based forms

 Pipes
 --------

 Pipes are feature generally used for two purposes

 1. Formatting the Information
    Ex: Showing number in currency format
        Showing string in a required format
        Showing date according to the location
        Showing text according to the local language
 2. For Filtering 
    Ex: Based on a condition you can filter an array
    and show only the elements passing the condition

    Pipes can be applied on scalar as well as array
    variables

    if applied scalar (string,number,boolean,date) generally
    it formats the information

    if applied on  arrays generally filters the information

    Ex:
    {{ price | currency: 'EUR' }}

    The price will be displayed with euro symbol

    {{ name | uppercase}}

    the name will be shown in upper case

    So there are few inbuilt pipes in Angular
    to apply on scalar variables like uppercase, lowercase, percent,
    currency,date

    There are no inbuilt pipes to apply on arrays

    but both scalar types and array types you can
    have your own pipes

    Generally a pipe has following parts

    1. Pipename
    2. Target
    3. Parameters(optional , one/more)
    
    {{price | currency: 'INR'}}

    INR - parameter
    currency - pipename
    Price -target 
   
   {{name | uppercase}}

   uppercase - pipename
   name - target

   no parameters

   