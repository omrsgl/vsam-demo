# VSAM Demo

The following demonstrate how to create a new OL VSAM project and expose VSAM data via APIs by forwarding the request to OL VSAM CICS program using the OpenLegacy CICS adapter.

## Prerequisites
* OpenLegacy IDE
* Install on the MF: OL VSAM CICS programs and OL CICS Adapter

## Step-by-Step guide

1. *Create new project* - Create a new *ol-vsam-api* project
    ```
./olvsam.sh -generate
    ```

2.	*Fetch Copybooks* - Fetch Copybooks from the MF that represent VSAM Records.
    Download the following Copybooks:
    

3.	*Generate Copybook* - Generate each copybook with command:
    ```
./olvsam.sh -record -add -lf {COPYBOOK-PATH}
    ```
    Replace placeholder `{COPYBOOK-PATH}` for the path of the Copybook you want to generate entities from.
    
    
4.	Add VSAM file definition by using this command:
    ```
./olvsam.sh -file -add <VSAM-FILE-NAME>
    ```
    Use `AAVSAMML` for `<VSAM-FILE-NAME>`.
    Use `AAESDSML` for `<VSAM-FILE-NAME>`.
> **_NOTE:_** The VSAM file definition will be added to `application.yml`. e.g.


    ```
ol:
  vsam:
    files: 
      - name: {VSAM-FILE-NAME}
        type: {KSDS/ESDS}
    ```

NOTE: Files without part-names must be generated with RECORD-TYPE-ID (see section 2).

e.g.
ol:
  vsam:
    files: 
      - name: F6875DTL
        type: KSDS
        part-names: [ F6875det ]
        key-offset: 1
        key-length: 20








## Table of Content
* [vsam-cli-installation](VSAM APIs)

## VSAM APIs
OL VSAM API provide the following actions through an API:
* View available objects with Attribute List for scanning
* Read a record
* Return a list of VSAM record and pagination
* Read entire VSAM file
* Search for records that fulfill the SAR fields conditions
