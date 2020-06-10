# VSAM Demo

The following demonstrate how to create a new OL VSAM project and expose VSAM data via APIs by forwarding the request to OL VSAM CICS program using the OpenLegacy CICS adapter.

## Prerequisites
* OpenLegacy IDE
* Install on the MF: OL VSAM CICS programs and OL CICS Adapter

## Step-by-Step guide

1. Clone `vsam-demo` Git repository

2. Download OL VSAM CLI from this [link](https://drive.google.com/file/d/1KS9XcvsrWneotJsY3hdmDcLNJCpit_xn/view?usp=sharing) and copy it to folder `/resources/scripts/jar/`

3. In your cloned Git repository, delete the folder `ol-vsam-api` (you are going to create this project from scratch)

4. Go to folder `/resources/scripts/` in your cloned Git repository and run the following commands:
    Create a new `ol-vsam-api` project
    ```
    ./olvsam.sh -generate
    ```
    An empty VSAM project was generated in the base folder of your cloned Git repository.
    
5. Import the project `ol-vsam-api` to the IDE as Maven project:
   `File` -> `import...` -> `Existing Maven Projects` -> Root directory: Select `ol-vsam-api` project in the base folder of your cloned Git repository -> `Finish`
    
6.	*Generate Copybooks* - Generate 4 copybook with the following commands:
    ```
    ./olvsam.sh -record -list
    ./olvsam.sh -record -add -lf ../cpy/F5750024.cpy -hdr ../cpy/F5750HIS.cpy -id 024C -redefines string
    ./olvsam.sh -record -add -lf ../cpy/F5750025.cpy -hdr ../cpy/F5750HIS.cpy -id 025C -redefines string
    ./olvsam.sh -record -add -lf ../cpy/F5750040.cpy -hdr ../cpy/F5750HIS.cpy -id 040C -redefines string
    ./olvsam.sh -record -add -lf ../cpy/F5750044.cpy -hdr ../cpy/F5750HIS.cpy -id 044C -redefines string
    ./olvsam.sh -record -list
    ```
    After running these commands, you will see new entities in the project package `com.vsam_api.openlegacy.entity`
    > **NOTE**
    > `-record -list` displays the current records in the project
    > `-id` parameter is a custom implementation, when there are multiple VSAM records in a single VSAM File
    > `-redefines string` parameter means that all REDEFINES occurences in the Copybooks will be generated as String.
    
7.	*Add VSAM file definition* - Add VSAM file definition with the following commands:
    ```
    ./olvsam.sh -file -list
    ./olvsam.sh -file -add AAVSAMML
    ./olvsam.sh -file -add AAVS40ML
    ./olvsam.sh -file -add AAVS50ML
    ./olvsam.sh -file -add AAVS51ML
    ./olvsam.sh -file -list
    ```
    After running these commands, you will see new VSAM file definitions in the project, in `applicaiton.yml`, in property `ol.vsam.files`
    > **NOTE**
    > `-file -list` displays the current files in the project

8.  *Run and test the API*
    `Right-click` on the project name -> `OpenLegacy` -> `Run application`
    open the browser in http://localhost:8080/swagger
    
    **Test1 - Get Records:**
    In `GET: /objects/{object-name}/records` ->
    `Count` = 10
    `object-name` = AAVS51ML
    
    After executing, you should receive records data back
    
    **Test2 - Search Records:**
    In `POST: /objects/{object-name}/sar` ->
    `Count` = 10
    `object-name` = AAVS51ML
    Json body =
    ```
    [
      {
        "fieldName": "histTimeStmp.histOperatorId",
        "fieldValue": "RTV",
        "isFullMatch": true
      }
    ]
    ```
    After executing, you should receive record data back
    
    
