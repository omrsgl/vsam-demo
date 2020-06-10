      ****************************************************************  00164500
      * COPYBOOK F5750024 - NEW FOR TOOTHMAP EXPANSION/REDESIGN         00164613
      *                     PURGED CHARGES RECORD                       00164614
      * COMMON AREA (KEY TO THIS RECORD) - F5750HIS                     00164615
      * RECORD TYPE 24.                                                 00165215
      *                                                                 00165327
      * CHANGE HISTORY:                                                 00165328
      *                                                                 00165329
THMPRC* 030307 RCC TOOTHMAP EXPANSION/REDESIGN                          00165330
      *            INITIAL VERSION CREATED                              00165340
      *                                                                 00165350
      *****************  I  M  P  O  R  T  A  N  T  *****************   00165360
      *  IF THIS COPYBOOK CHANGES:                                      00165361
      *    1. THE HARDCODED RECORD LAYOUT 'WS-PC-CHG-RECORD' IN PURGE   00165362
      *       MODULE F5910PX6 MUST BE CHANGED ACCORDINGLY.              00165370
      *    2. THE FOLLOWING CONVERSION MODULES HAVE HARD-CODED LAYOUTS  00165372
      *       AND SHOULD BE CHECKED AS WELL:                            00165373
      *          F5750HSC, F5750IBC, F5750IBE                           00165374
      *                                                                 00165375
      ****************************************************************  00165413
           03 PC-24-RECORD.                                             00165627
              04 PC-NBR-CHGS                   PIC S9(3) COMP-3.        00165727
              04 PC-CHG-HIST    OCCURS 90 TIMES.                        00165827
                 06 PC-CHG-RECORD.                                      00166027
                    08 PC-START-EXPDT          PIC S9(5) COMP-3.        00166127
                    08 PC-COORD-BENE           PIC X(1).                00166227
                    08 PC-CYCLE-DT             PIC S9(5) COMP-3.        00166327
                    08 PC-DT-SERV              PIC S9(5) COMP-3.        00166427
                    08 PC-CHG-FEE              PIC S9(5)V99 COMP-3.     00166527
                    08 PC-PROC-RENDERED        PIC X(5).                00166627
                    08 PC-PROC-BENEFIT         PIC X(5).                00166727
                    08 PC-PROC-DED-MAX-TYPES.                           00168227
                       10  PC-PROC-DED-TYPE PIC X.                      00168327
                       10  PC-PROC-MAX-TYPE PIC X.                      00168427
                    08 PC-PROS-DATE            PIC S9(5) COMP-3.        00168527
                    08 PC-TOOTH                PIC X(2).                00168727
                    08 PC-UNITS-QUAD-ARCH      PIC X(2).                00168827
                    08 PC-UNITS-QUAD-ARCH9 REDEFINES                    00168828
                       PC-UNITS-QUAD-ARCH      PIC 9(2).                00168829
                    08 PC-HOWPROC              PIC X(1).                00169027
                    08 PC-OTHER-INS            PIC X(1).                00169227
                    08 PC-PROV-NAME            PIC X(6).                00169334
                    08 PC-PROV-PHONE           PIC X(7).                00169434
                    08 PC-PROV-PHONE9 REDEFINES                         00169435
                       PC-PROV-PHONE           PIC 9(7).                00169436
                    08 PC-PROV-STATE           PIC X(2).                00169534
                    08 PC-MEC-USED             PIC X(1).                00169634
                    08 PC-TH-SURFACES          PIC X(5).                00169734
                    08 FILLER REDEFINES PC-TH-SURFACES.                 00169834
                       10 PC-TH-SURFACE        PIC X(1)                 00169934
                          OCCURS 5 TIMES.                               00170034
                    08 PC-UPDATE               PIC X(1).                00170134
                    08 PC-STATUS               PIC X(2).                00173027
                       88 PC-ST-PAID            VALUES 'P ' ' P'.       00174028
                       88 PC-ST-DENIED          VALUES 'HD' 'SD'.       00175028
                    08 PC-CHG-ERROR            PIC X(2).                00175127
                    08 PC-DIC-CODE.                                     00175128
                       10 PC-DIC-CODE-1        PIC X(1).                00175129
                       10 PC-DIC-CODE-2        PIC X(1).                00175130
                    08 PC-DIC-REASON.                                   00175140
                       10 PC-DIC-REASON-1      PIC X(1).                00175150
                       10 PC-DIC-REASON-2      PIC X(1).                00175160
                    08 PC-FILE-CONTROL-NUM.                             00175170
                       10 PC-FILE-CONTROL-DATE PIC S9(7) COMP-3.        00175171
                       10 PC-FILE-CONTROL-SEQ  PIC S9(5) COMP-3.        00175180
                    08 FILLER                  PIC X(09).               00180016
                                                                        00190015
                                                                        00200015
