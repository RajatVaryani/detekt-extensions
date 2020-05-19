# detekt-extensions
    
## Usage  
  
- Import Detekt as a gradle plugin Refer this [link](https://arturbosch.github.io/detekt/groovydsl.html).
- Configure github packages as a repository and expose `USERNAME` and `TOKEN` as env variables.

```
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/RajatVaryani/detekt-extensions")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
        }
    }
```
- Add this as a plugin to detekt

```
dependencies {
    ...
    detektPlugins("rule:detekt-extensions:VERSION")
}

```
