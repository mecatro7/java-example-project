
# Coverity CLI
coverity setup


# Coverity On polaris
```sh
polaris setup
polaris -w analyze -- ./gradlew clean build
```
## polaris.yml
```yaml
version: "1"
project:
  name: java-example-project
  branch: master
  revision:
    name: 123
    date: 2017-05-30T13:25:30Z
capture:
  build:
    coverity:
analyze:
  mode: central
install:
  coverity:
    version: default
serverUrl: https://sipse.polaris.synopsys.com

```

# Poalris 
## coverity.yaml
```yaml
capture:
  build:
    clean-command: ./gradlew clean
    build-command: ./gradlew build
```
## inputFile.json

```json
{
    "data":{
        "polaris": {
            "application": {
                "name": "gwyi-Applicaiton4"
            },
            "project": {
                "name": "java-example-project"
            },
            "branch": {
                "name": "main"
            },
            "assessment": {
                "types": ["SAST"]
            },
            "serverUrl": "https://poc.polaris.blackduck.com"
        }
    }
}
```



```sh
export BRIDGE_POLARIS_ACCESSTOKEN=
bridge-cli --stage polaris --input inputFile.json
```