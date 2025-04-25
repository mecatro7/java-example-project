
# Coverity CLI
```sh
coverity setup
```
## coveirty.yaml
```yaml
capture:
  build:
    clean-command: ./gradlew clean
    build-command: ./gradlew build

```
```sh
coverity capture
```
## console output
[coverity-cli-console.log](coverity-cli-console.log)

# Coverity On polaris
```sh
polaris setup
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

```sh
polaris -w analyze -- ./gradlew clean build
```

[CoP-console.log](CoP-console.log)

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

[polaris-console.log](polaris-console.log)
