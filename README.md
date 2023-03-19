<h1>Riot Games API
<img src="https://user-images.githubusercontent.com/63880117/226095441-175f1c45-ffaa-456a-b486-128deec3a8be.png" height="64" width="64" align="left" alt="">
</h1>

DESCRIPTION
-------------
 
 Simple to use Riot Games API
 
 
ADD AS DEPENDENCY
-------------
 
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

CALLING API
-------------

```java
//https://developer.riotgames.com/
RiotAPI riotAPI = new RiotAPI("YOUR_API_KEY_HERE", Region.YOUR_REGION, Server.YOUR_SERVER)
```

EXAMPLES
-------------

```java
RiotAPI riotAPI = new RiotAPI("YOUR_API_KEY_HERE", Region.YOUR_REGION, Server.YOUR_SERVER);
Summoner summoner = riotAPI.getSummonerByName("summoner_name");
System.out.println(summoner.getProfileIconId());
```

RELEASES
-------------
- 1.0-beta

```
Region and server selection added.
```
```java
RiotAPI riotAPI = RiotAPIBuilder.create("YOUR_API_KEY_HERE", Region.EUROPE, Server.TR1);
```

- 1.1-BETA

```
Some improvements & changes.
```
```java
RiotAPI riotAPI = new RiotAPI("YOUR_API_KEY_HERE", Region.YOUR_REGION, Server.YOUR_SERVER);
```