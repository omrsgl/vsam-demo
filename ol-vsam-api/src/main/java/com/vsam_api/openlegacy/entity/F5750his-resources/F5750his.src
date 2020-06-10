           03  HISTCOM.                                                 840521UP
           04  HIST-COMMON.                                                     
      ********************************************************************      
      *                                                                  *      
      *          RECORD CODES USING THIS AREA ARE - 005-050-044          *      
      *                                                                  *      
THMPRC* 030307 RCC TOOTHMAP EXPANSION/REDESIGN                           *      
      *            TAG-THMPRC - BOB CAMPBELL                             *      
      *            UPDATED FOR NEW 24 RECORD. THERE CAN BE MULTIPLE 24   *      
      *            RECORDS FOR A PATIENT.                                *      
      ********************************************************************      
               05  HIST-REC-CDE                    PIC S9(3) COMP-3.    780921CH
               05  HIST-TIME-STMP.                                              
                   10  HIST-OPERATOR-ID            PIC X(3).                    
                   10  HIST-CRT-CODE               PIC X(4).                    
                   10  HIST-DATE                   PIC S9(5) COMP-3.            
                   10  HIST-TIME                   PIC S9(7) COMP-3.            
               05  HIST-KEY.                                                    
                   10  HIST-KEY-CUSTOMER           PIC S9(7) COMP-3.    780921CH
                   10  HIST-KEY-EMPLOYEE-NO        PIC X(11).                   
                   10  HIST-KEY-PATIENT.                                780928AD
                     15  HIST-KEY-RELATION           PIC X.             780928CH
                     15  HIST-KEY-SEQUENCE           PIC S9(3) COMP-3.  780928CH
                   10  HIST-KEY-COV-TYPE           PIC X.                       
                   10  HIST-KEY-FCN.                                    781117AD
                     15 HIST-KEY-FILE-CONTROL-DATE  PIC S9(7) COMP-3.   781117CH
                     15 HIST-KEY-FILE-CONTROL-SEQ   PIC S9(5)  COMP-3.  781117CH
                     15 HIST-KEY-FILE-CONTROL-OFF   PIC S9(3)  COMP-3.  781117CH
                   10  HIST-MED-KEY-FCN REDEFINES HIST-KEY-FCN.         840521AD
                     15 HIST-MED-KEY-EXPENSE-PERIOD-DT                          
                                                    PIC S9(5)  COMP-3.          
                     15 HIST-MED-KEY-SUBMISSION-DATE                            
                                                    PIC S9(5)  COMP-3.          
                     15 HIST-MED-KEY-FILE-CONTROL-SEQ                           
                                                    PIC S9(5)  COMP-3.          
                   10  HIST-KEY-SEQ.                                    781117AD
                     15 HIST-KEY-ENTRY-SEQ          PIC S9   COMP-3.    781117CH
                     15 HIST-KEY-CONTINUATION       PIC S9   COMP-3.    781117CH
THMPRC             10  HIST-KEY-REC24 REDEFINES HIST-KEY-SEQ.           781117AD
THMPRC               15 HIST-KEY-REC24-RECNBR       PIC S9(2) COMP-3.           
                   10  HIST-KEY-REC-TYPE            PIC S9(3) COMP-3.   781117CH
