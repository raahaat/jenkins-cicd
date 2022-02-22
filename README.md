# jenkins-cicd

Download the war file from : https://www.jenkins.io/download/

Steps:
download the war file from the mentioned link
cmd : `java -jar C:\Users\pkuma\Downloads\jenkins.war --httpPort=9090`
  -- A key will be generated : `312e163e20c549fa9d20be1e20ea27a7`
 ` C:\Users\pkuma\.jenkins\secrets\initialAdminPassword`
  
  -Run in localhost:9090 port
  -then setup an admin : pks, era123




## My Setup

port : 9090

## In localhost:9090 the following admin pannel can be found
![image](https://user-images.githubusercontent.com/46686524/148693517-c31d2dae-6f3d-493c-bb6b-510655ab8e4a.png)

- The auto gernated password must be added here
- Then the system asks for insatlling plugins. I have chosen the suggested plugins which automatically installs some popular plugins such as git,pipeline, ant, grade etc

Then the following panel is shown. It asks to create the first admin
![image](https://user-images.githubusercontent.com/46686524/148693859-7bff92e7-4a9e-464a-8a04-cdde87b38a09.png)

Then this jenkins url is asked such the following image
![image](https://user-images.githubusercontent.com/46686524/148693916-5d126016-3544-4d85-a505-30b49520d9aa.png)

Jenkins is then ready to use! congrats!

## adding a maven project in jenkins
- from the dashboard choose manage jenkins
![image](https://user-images.githubusercontent.com/46686524/148694126-cbe46798-6d93-4ccb-84e9-c52329889215.png)

-Then select manage plugins >> available >> [find maven plugin]>> insatll the maven ingetration plugin for deploying maven projects

## deploy new item
- from the dash baord choose new item
![image](https://user-images.githubusercontent.com/46686524/148694310-dc057821-be2e-43c0-8cde-331655ddfbde.png)

- enter a name like the above picture and choose Maven project . Press okay on the left below

We are directed to the following page
![image](https://user-images.githubusercontent.com/46686524/148694362-b3fd6e14-113d-49df-9a03-127eea79a28f.png)

- from the source code manager the git option must be selected and then the git project URL needs to be pasted
![image](https://user-images.githubusercontent.com/46686524/148694395-4b6ad48f-9c1e-4949-88b3-6d069bb57f06.png)

## adding jdk from global config 
![image](https://user-images.githubusercontent.com/46686524/154003666-b2fafb8d-793a-41d5-9c2c-43e86af63d42.png)

## adding maven home like following
![image](https://user-images.githubusercontent.com/46686524/154003814-5555386a-4a0e-4366-9dce-b98cc0d70e18.png)

## Testing if windows command is running
![image](https://user-images.githubusercontent.com/46686524/154004033-ddf48112-c75f-4c30-b8b0-a18a8215a262.png)
--After clicking build now button the console will show the following console output
![image](https://user-images.githubusercontent.com/46686524/154004569-fca46c4b-eb3d-412b-8f9e-181c9c1d4c2c.png)

## adding Git project in build
from the source code management branch , select and the following items. If git proejct is private then credentials must be provided as well
![image](https://user-images.githubusercontent.com/46686524/154004951-2b5007da-fdae-42ed-a2eb-8dcdc8ed6746.png)

## adding command to generate jar/war file from the project
![image](https://user-images.githubusercontent.com/46686524/154007911-6f5a5fe5-e3d8-4a0a-9b6c-b17cea87ee25.png)
-a sucessful build

![image](https://user-images.githubusercontent.com/46686524/154009060-7804a123-40d3-434e-a9cf-70d66b5258c5.png)
![image](https://user-images.githubusercontent.com/46686524/154009087-5a2aee9c-193a-40d3-bfa9-f715b0d74470.png)
-sucessful war file build and run
- building a war file
![image](https://user-images.githubusercontent.com/46686524/154011939-bb173a56-d9ce-4a18-8650-ee232aa261ae.png)
- suceessful running
![image](https://user-images.githubusercontent.com/46686524/154011418-fc0d13dc-cefe-41e6-ad8f-0c05bc5981ba.png)




## Tomcat config
add manager-script to tomcat-user.xml like the following

```
<role rolename="manager"/>
<role rolename="admin"/>

<user username="admin" password="admin"
fullName="Administrator" roles="admin,manager,manager-gui,admin-gui,manager-script"/>
```

## from manage jenkins >> add plugins >> add `deploy to container` like follwoing image

![image](https://user-images.githubusercontent.com/46686524/154029687-f80b3e1c-e012-4f4f-a212-c71670da981f.png)

## fill up the post deployment providing the following items
![image](https://user-images.githubusercontent.com/46686524/154035860-b5e8e819-496d-44c1-855c-c946b54bccfa.png)

# Automated build with github commit using Web hook

* Download Ngrok from https://ngrok.com/download . Ngrok helps to convert local ip to recognizable web ip.

## using ngrok
open cmd and command is : `ngrok.exe protocol portnumber` (ex : ngrok.exe http 8080 where 8080 is the port where jankins is running)

![image](https://user-images.githubusercontent.com/46686524/155067135-dcd447ba-01ac-4fb1-ad19-aec59197ee5a.png)

using webhook from github like following
![image](https://user-images.githubusercontent.com/46686524/155067748-9c8add7d-46d4-4afc-8d82-4d1bae597597.png)

After setting up web hook the and commiting in reporsitory autiomatically jenkins build will be triggered like following image

The changes will be reflected after the automated build.
![image](https://user-images.githubusercontent.com/46686524/155070616-1ec7c04f-0967-4110-9d27-7c04957b66ab.png)









https://www.youtube.com/watch?v=GlQHS7FdVGM&list=PL6flErFppaj35spJjPy41-lruDjw2kRV-&index=8&ab_channel=Mukeshotwani

