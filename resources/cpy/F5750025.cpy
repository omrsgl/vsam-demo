           03  HIST025.                                                 00000010
           04  HIST-COVERAGE-DENTAL-REC.                                00000020
      ***************************************************************** 00000030
      **         HISTORY PATIENT DENTAL  COVERAGE RECORD              * 00000040
      *          RECORD TYPE VALUE  025                               * 00000050
      *          COMMON AREA IS F5750HIS                              * 00000060
      *                                                               * 00000060
MCRA20*031911    MCR AUTOMATION - PRE-APPROVAL DETAILS FOR 4341/4342  *         
THMPEW*030307    EAW TOOTHMAP EXPANSION/REDESIGN                      *         
      *              TAG IS THMPEW FOR LIBBY WALDREP                  *         
      *              THIS RECORD IS NOT BEING REFORMATTED AS PART OF  *         
      *              THIS PROJECT.  THE FIELDS PREFIXED WITH THMP-    *         
      *              WILL NOT BE AVAILABLE FOR VIEW AS A RESULT OF    *         
      *              THIS PROJECT.  THE DATA WILL REMAIN IN THE AREAS *         
      *              DEFINED BY THE THMP- FIELDS.  THESE FIELDS ARE NO*         
      *              LONGER UPDATED.                                  *         
0803JH*080306    JSH DISEASE-RISK-MANAGEMENT - TAX ID FOR PRIVACY     *         
0603JH*060306    JSH DISEASE-RISK-MANAGEMENT                          *         
      ***************************************************************** 00000070
MUR140* 120714  AUTHOR : COGNIZANT                                    * 00086080
MUR140*        PROJECT : MUR PHASE-2 DECEMBER RELEASE                 * 00086090
MUR140*    DESCRIPTION : THE FOLLOWING CHANGES ARE DONE               * 00086100
MUR140*               1) CHANGE HIST-PAT-DCOV-CONSULT-MSG-TBL TO      *         
MUR140*                  INCREASE HIST-PAT-DCOV-CONSULT-MESSAGE FROM  *         
MUR140*                  5 OCCURENCES TO 10 OCCURENCES                *         
MUR140*               2) ADJUST THE LENGTH OF HIST-PAT-DCOV-FILLER-2  * 00086300
MUR140***************************************************************** 00086400
           05  HIST-PAT-DCOV-NUMBER                    PIC S9  COMP-3.  00000080
           05  HIST-PAT-DCOVERAGE-DATA.                                 00000090
               15 HIST-PAT-DCOV-DATES OCCURS 5 TIMES.                   00000100
                      20  HIST-PAT-DCOV-COVERAGE-START PIC S9(5) COMP-3.00000110
                      20  HIST-PAT-DCOV-COVERAGE-STOP  PIC S9(5) COMP-3.00000120
THMPEW         15  THMP-PAT-DCOV-TOOTH-STAT  OCCURS 32.                 00000130
THMPEW             20  THMP-PAT-DCOV-TOOTH-COND        PIC X.           00000140
THMPEW             20  THMP-PAT-DCOV-TOOTH-DATE    PIC S9(5) COMP-3.    00000340
               15  HIST-PAT-DCOV-LIFE-TOTALS-BEN.                       00000350
                   20  HIST-PAT-DCOV-LTT-G  OCCURS 8 TIMES.             00000360
                    25 HIST-PAT-DCOV-LIFE-TOT-TYP  PIC S9(7)V99 COMP-3. 00000370
               15  HIST-PAT-DCOV-LIFE-TOTAL  REDEFINES                  00000380
                                      HIST-PAT-DCOV-LIFE-TOTALS-BEN.    00000390
                   20  HIST-PAT-DCOV-LIFE-TOT-TYPA PIC S9(7)V99 COMP-3. 00000400
                   20  HIST-PAT-DCOV-LIFE-TOT-TYPB PIC S9(7)V99 COMP-3. 00000410
                   20  HIST-PAT-DCOV-LIFE-TOT-TYPC PIC S9(7)V99 COMP-3. 00000420
                   20  HIST-PAT-DCOV-LIFE-TOT-TYPD PIC S9(7)V99 COMP-3. 00000430
                   20  HIST-PAT-DCOV-LIFE-TOT-TYPE PIC S9(7)V99 COMP-3. 00000440
                   20  HIST-PAT-DCOV-LIFE-TOT-ORTO PIC S9(7)V99 COMP-3. 00000450
                   20  HIST-PAT-DCOV-LIFE-TOT-PERO PIC S9(7)V99 COMP-3. 00000460
                   20  HIST-PAT-DCOV-LIFE-TOT-TYPZ PIC S9(7)V99 COMP-3. 00000470
               15  HIST-PAT-DCOV-LIFE-TOTALS-DED.                       00000480
                   20  HIST-PAT-DCOV-LD-G      OCCURS 7 TIMES.          00000490
                     25 HIST-PAT-DCOV-LIFE-DED     PIC S9(5)V99 COMP-3. 00000500
               15  HIST-PAT-DCOV-LIFE-DEDU  REDEFINES                   00000510
                                         HIST-PAT-DCOV-LIFE-TOTALS-DED. 00000520
                   20  HIST-PAT-DCOV-LIFE-DEDA     PIC S9(5)V99 COMP-3. 00000530
                   20  HIST-PAT-DCOV-LIFE-DEDB     PIC S9(5)V99 COMP-3. 00000540
                   20  HIST-PAT-DCOV-LIFE-DEDC     PIC S9(5)V99 COMP-3. 00000550
                   20  HIST-PAT-DCOV-LIFE-DEDD     PIC S9(5)V99 COMP-3. 00000560
                   20  HIST-PAT-DCOV-LIFE-DEDE     PIC S9(5)V99 COMP-3. 00000570
                   20  HIST-PAT-DCOV-LIFE-DEDO     PIC S9(5)V99 COMP-3. 00000580
                   20  HIST-PAT-DCOV-LIFE-DEDP     PIC S9(5)V99 COMP-3. 00000590
THMPEW         15  THMP-PAT-DCOV-PRIOR-DT-UPR      PIC S9(5) COMP-3.    00000600
THMPEW         15  THMP-PAT-DCOV-TYPE-UPR          PIC X.               00000610
THMPEW         15  THMP-PAT-DCOV-PRIOR-DT-LOWER    PIC S9(5) COMP-3.    00000670
THMPEW         15  THMP-PAT-DCOV-TYPE-LWR          PIC X.               00000680
               15  HIST-PAT-DCOV-COB-SAVINGS-AMT   PIC S9(5)V99 COMP-3. 00000740
               15  HIST-PAT-DCOV-COB-SAVE-EXT-MAX  PIC S9(5)V99 COMP-3. 00000750
               15  HIST-PAT-DCOV-NET-CHK-AMT       PIC S9(7)V99 COMP-3. 00000760
               15  HIST-PAT-DCOV-PAY-REDUC         PIC S9(7)V99 COMP-3. 00000770
               15  HIST-PAT-DCOV-OP-AMT            PIC S9(7)V99 COMP-3. 00000780
               15  HIST-PAT-DCOV-PURGE-IND                 PIC X(1).    00000790
THMPEW         15  THMP-PAT-DCOV-FULL-MOUTH-XR-DT  PIC S9(5) COMP-3.    00000820
      * THE FOLLOWING FIELD HAS BEEN ADDED FOR A PERIO INDICATOR        00000830
      * THE FILLER BELOW WAS 2 BYTES CHANGED TO 1 AND ADDED INDICATOR   00000840
THMPEW     05  THMP-PAT-DCOV-PRIOR-PERIO-IND       PIC X.               00000850
           05  HIST-PAT-DCOV-FILLER                PIC X.               00000890
      * EXPANDED AREA FOR PERIO                                         00000900
THMPEW     05  THMP-PAT-DCOV-PERIO-FULL-TBL.                            00000940
THMPEW       10  THMP-PAT-DCOV-PERIO-FULL-MOUTH OCCURS 4.               00000910
THMPEW           15  THMP-PAT-DCOV-PERIO-FM-PROC   PIC X(5).            00000920
THMPEW           15  THMP-PAT-DCOV-PERIO-FM-DATE   PIC S9(5) COMP-3.    00000930
           05  HIST-PAT-DCOV-PERIO-FULL-FILL       PIC X(64).           00001050
THMPEW     05  THMP-PAT-DCOV-PERIO-QUAD-TBL.                            00000940
THMPEW         10  THMP-PAT-DCOV-PERIO-QUAD-TAB OCCURS 10.              00000940
THMPEW             15  THMP-PAT-DCOV-PERIO-QUAD-PROC  PIC X(5).         00000950
THMPEW             15  THMP-PAT-DCOV-PERIO-QUAD-UR-DT                   00000960
THMPEW                                             PIC S9(5) COMP-3.    00000960
THMPEW             15  THMP-PAT-DCOV-PERIO-QUAD-LR-DT                   00000970
THMPEW                                             PIC S9(5) COMP-3.    00000970
THMPEW             15  THMP-PAT-DCOV-PERIO-QUAD-UL-DT                   00000980
THMPEW                                             PIC S9(5) COMP-3.    00000970
THMPEW             15  THMP-PAT-DCOV-PERIO-QUAD-LL-DT                   00000990
THMPEW                                             PIC S9(5) COMP-3.    00000970
THMPEW             15  THMP-PAT-DCOV-PERIO-QUAD-CC-DT                   00001000
THMPEW                                             PIC S9(5) COMP-3.    00000970
           05  HIST-PAT-DCOV-PERIO-QUAD-FILL       PIC X(400).          00001050
THMPEW     05  THMP-PAT-DCOV-PERIO-TOOTH-TBL.                           00001010
THMPEW         10  THMP-PAT-DCOV-PERIO-TOOTH-TAB OCCURS 16.             00001010
THMPEW             15  THMP-PAT-DCOV-PERIO-TOOTH-PROC      PIC X(5).    00001020
THMPEW             15  THMP-PAT-DCOV-PERIO-TOOTH-INFO OCCURS 33 TIMES.  00001030
THMPEW                 20 THMP-PAT-DCOV-PERIO-TOOTH-DT PIC S9(5) COMP-3.00001040
           05  HIST-PAT-DCOV-PERIO-TOOT-FILL       PIC X(3536).         00001050
           05  HIST-PAT-DCOV-CONV-TOTALS-BEN.                           00001060
               15  HIST-PAT-DCOV-CONV-G  OCCURS 8 TIMES.                00001070
                   20 HIST-PAT-DCOV-CONV-TOT-TYP   PIC S9(7)V99 COMP-3. 00001080
           05  HIST-PAT-DCOV-CONV-TOTAL  REDEFINES                      00001090
                         HIST-PAT-DCOV-CONV-TOTALS-BEN.                 00001100
               15  HIST-PAT-DCOV-CONV-TOT-TYPA     PIC S9(7)V99 COMP-3. 00001110
               15  HIST-PAT-DCOV-CONV-TOT-TYPB     PIC S9(7)V99 COMP-3. 00001120
               15  HIST-PAT-DCOV-CONV-TOT-TYPC     PIC S9(7)V99 COMP-3. 00001130
               15  HIST-PAT-DCOV-CONV-TOT-TYPD     PIC S9(7)V99 COMP-3. 00001140
               15  HIST-PAT-DCOV-CONV-TOT-TYPE     PIC S9(7)V99 COMP-3. 00001150
               15  HIST-PAT-DCOV-CONV-TOT-ORTO     PIC S9(7)V99 COMP-3. 00001160
               15  HIST-PAT-DCOV-CONV-TOT-PERO     PIC S9(7)V99 COMP-3. 00001170
               15  HIST-PAT-DCOV-CONV-TOT-TYPZ     PIC S9(7)V99 COMP-3. 00001180
           05  HIST-PAT-DCOV-CONV-TOTALS-DED.                           00001190
               10  HIST-PAT-DCOV-LD-G      OCCURS 7 TIMES.              00001200
                   15 HIST-PAT-DCOV-CONV-DED       PIC S9(5)V99 COMP-3. 00001210
           05  HIST-PAT-DCOV-CONV-DEDU  REDEFINES                       00001220
                               HIST-PAT-DCOV-CONV-TOTALS-DED.           00001230
               10  HIST-PAT-DCOV-CONV-DEDA         PIC S9(5)V99 COMP-3. 00001240
               10  HIST-PAT-DCOV-CONV-DEDB         PIC S9(5)V99 COMP-3. 00001250
               10  HIST-PAT-DCOV-CONV-DEDC         PIC S9(5)V99 COMP-3. 00001260
               10  HIST-PAT-DCOV-CONV-DEDD         PIC S9(5)V99 COMP-3. 00001270
               10  HIST-PAT-DCOV-CONV-DEDE         PIC S9(5)V99 COMP-3. 00001280
               10  HIST-PAT-DCOV-CONV-DEDO         PIC S9(5)V99 COMP-3. 00001290
               10  HIST-PAT-DCOV-CONV-DEDP         PIC S9(5)V99 COMP-3. 00001300
THMPEW     05  THMP-PAT-DCOV-FULLM-XR-DT-PR        PIC S9(5) COMP-3.    00001310
0803JH     05  HIST-PAT-DCOV-RSK-GUID-GRP.                                      
0803JH         10  HIST-PAT-DCOV-RSK-GUID-IND      PIC X(1).            00001310
0803JH         10  HIST-PAT-DCOV-RSK-GUID          PIC X(36).           00001310
0603JH     05  HIST-PAT-DCOV-RSK-INITIAL.                                       
0803JH         10  HIST-PAT-DCOV-RSK-FLAG-ORIG     PIC  X(1).           00001310
0803JH         10  HIST-PAT-DCOV-RSK-TAX-ID-ORIG   PIC S9(9) COMP-3.    00001310
0603JH         10  HIST-PAT-DCOV-RSK-DATE-ORIG     PIC S9(7) COMP-3.    00001310
0603JH         10  HIST-PAT-DCOV-RSK-RISK-ORIG     PIC S9(3) COMP-3.    00001310
0603JH         10  HIST-PAT-DCOV-RSK-DSTATE-ORIG   PIC S9(3) COMP-3.    00001310
0603JH     05  HIST-PAT-DCOV-RSK-ONGOING OCCURS 9 TIMES.                        
0803JH         10  HIST-PAT-DCOV-RSK-FLAG-ONGO     PIC  X(1).           00001310
0803JH         10  HIST-PAT-DCOV-RSK-TAX-ID-ONGO   PIC S9(9) COMP-3.    00001310
0603JH         10  HIST-PAT-DCOV-RSK-DATE-ONGO     PIC S9(7) COMP-3.    00001310
0603JH         10  HIST-PAT-DCOV-RSK-RISK-ONGO     PIC S9(3) COMP-3.    00001310
0603JH         10  HIST-PAT-DCOV-RSK-DSTATE-ONGO   PIC S9(3) COMP-3.    00001310
0603JH     05  HIST-PAT-DCOV-RSK-EVALS.                                         
0603JH         10  HIST-PAT-DCOV-RSK-EVAL-ORIG     PIC X(36).           00001310
0603JH         10  HIST-PAT-DCOV-RSK-EVAL-PREV     PIC X(36).           00001310
0603JH         10  HIST-PAT-DCOV-RSK-EVAL-CURR     PIC X(36).           00001310
MCRA20     05  HIST-PAT-DCOV-PREAUTH-RECS.                                      
MCRA20         10  HIST-PAT-DCOV-SEGMENT-ALL OCCURS 4 TIMES.            00000100
MCRA20             15  HIST-PAT-DCOV-QUAD          PIC X(2).            00000110
MCRA20             15  HIST-PAT-DCOV-PROC          PIC X(5).            00000120
MCRA20             15  HIST-PAT-DCOV-PROC-N  REDEFINES                  00000120
MCRA20                 HIST-PAT-DCOV-PROC          PIC 9(5).                    
MCRA20             15  HIST-PAT-DCOV-CON           PIC X(3).            00000120
MCRA20             15  HIST-PAT-DCOV-AUTH-DATE     PIC S9(8) COMP-3.    00000120
MCRA20             15  HIST-PAT-DCOV-DCN.                               00000120
MCRA20                 20  HIST-PAT-DCOV-DCN-DT    PIC S9(6) COMP-3.            
MCRA20                 20  HIST-PAT-DCOV-DCN-SEQ   PIC X(6).                    
MCRA20             15  HIST-PAT-DCOV-FCN.                               00000120
MCRA20                 20  HIST-PAT-DCOV-FCN-DT    PIC S9(5) COMP-3.            
MCRA20                 20  HIST-PAT-DCOV-FCN-SEQ   PIC S9(5) COMP-3.            
MCRA20             15  HIST-PAT-DCOV-DELETED       PIC X(8).            00000120
MCRA20     05  HIST-PAT-DCOV-CONSULT-MSG-TBL.                                   
MUR140         10  HIST-PAT-DCOV-CONSULT-MESSAGE OCCURS 10 TIMES.               
MUR140*MCRA20         10  HIST-PAT-DCOV-CONSULT-MESSAGE OCCURS 5 TIMES.         
MCRA20             15  HIST-PAT-DCOV-CONSULT-MSG   PIC X(72).                   
MCRA20     05  HIST-PAT-DCOV-PREAUTH-IND           PIC X(1).                    
MUR140     05  HIST-PAT-DCOV-FILLER-2              PIC X(338).          00001310
0603JH*    05  HIST-PAT-DCOV-FILLER-2              PIC X(1500).         00001310
0803JH*    05  HIST-PAT-DCOV-FILLER-2              PIC X(1312).         00001310
MCRA20*    05  HIST-PAT-DCOV-FILLER-2              PIC X(1215).         00001310
MUR140*MCRA20     05  HIST-PAT-DCOV-FILLER-2              PIC X(698).   00001310
