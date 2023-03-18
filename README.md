<h1>Riot Games API
<img src="https://user-images.githubusercontent.com/63880117/226095441-175f1c45-ffaa-456a-b486-128deec3a8be.png" height="64" width="64" align="left" alt="">
</h1>

 - Description
 
 Simple to use Riot Games API
 
 
 - Add as dependency
 
 ```xml
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
```
 
```xml
     <dependency>
            <groupId>com.github.GuneyYilmaz0</groupId>
            <artifactId>RiotAPI</artifactId>
            <version>VERSION</version>
     </dependency>
````

- Calling API

```java
//https://developer.riotgames.com/
RiotAPI riotAPI = RiotAPIBuilder.create("YOUR_API_KEY_HERE");
```

- Examples

```java
RiotAPI riotAPI = RiotAPIBuilder.create("YOUR_API_KEY_HERE");
Summoner summoner = riotAPI.getSummonerByName("summoner_name");
System.out.println(summoner.getProfileIconId());
```

- NOTICE
 For now, it only works for Turkey servers
 sorry :(
