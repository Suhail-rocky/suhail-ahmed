����   > l
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  #
---------------------------------

      java/io/PrintStream print (Ljava/lang/String;)V
      N_Queen canPlace (II)Z	     arr [I
    ! " display (I)V
  $ % & nQueens (II)V
 ( ) * + , java/lang/Math abs (I)I
  . /  	breakLine	  1 2 3 no I   5 6 7 makeConcatWithConstants (I)Ljava/lang/String; 9 	_ ; 	Q =  
  ? @  println B java/util/Scanner	  D E F in Ljava/io/InputStream;
 A H  I (Ljava/io/InputStream;)V K no of ways Of queens : 
 A M N O nextInt ()I Q No of queens : 	  S T 3 MAX Code LineNumberTable StackMapTable main ([Ljava/lang/String;)V <clinit> 
SourceFile N_Queen.java BootstrapMethods _
 ` a b 6 c $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; e Arrangement No.  InnerClasses h %java/lang/invoke/MethodHandles$Lookup j java/lang/invoke/MethodHandles Lookup !       T 3         2 3        U        *� �    V         /   U   %      	� � �    V   
        % &  U   t     /=� *� � � O� 
� � 
`� #���ױ    V   "             !  (  .  W    � �      U   l     /=d� '� .� � .d� 'd� '� ������    V       " 	 $  % % ' ' " - * W    � "�   ! "  U   �     \� -� � 0`Y� 0� 4  � � -<� :=� %� .� � 8� � � :� ���ܲ <� >���Ǹ -�    V   6    0  1  2  4 ! 6 ( 8 1 : < > D 6 J A R 4 X D [ E W    � � � �  	 X Y  U   [     +� AY� C� GL� J� >+� L=� P� >+� L>� #�    V       H  I  J  K   L % M * N  Z   U   *      
� R� R�
� �    V   
      
  [    \ ]     ^  d f   
  g i k 