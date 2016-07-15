import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XMLReader{
	public static void main(String args[])
	{
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		try
		{
			DocumentBuilder dBuilder=builderFactory.newDocumentBuilder();
			Document document=dBuilder.parse(XMLReader.class.getResourceAsStream("/SIL_FA_AssetBalanceFact.xml"));
			document.normalize();
			
			NodeList rootNodes=document.getElementsByTagName("FOLDER");
			Node rootNode=rootNodes.item(0);
			Element rootElement=(Element)rootNode;
			
			//SOURCE
			NodeList sourceList=rootElement.getElementsByTagName("SOURCE");
			for(int i=0; i<sourceList.getLength();i++)
			{
				Node theNode=sourceList.item(i);
				Element noteElement=(Element)theNode;
				/*
				System.out.println("This note is writen by "+
				noteElement.getAttribute("author")+" and it is "+
				" going to expire in "+ noteElement.getAttribute("expire")+ " days! \n"+
				"It has a "+noteElement.getAttribute("priority")+ " priority!");
				*/
				System.out.println("Database Type:"+noteElement.getAttribute("DBDNAME"));
				if(noteElement.getAttribute("DBDNAME").equals("BAWDEV"))
				{
					System.out.println("Create a file name as BAWDEV add the data");
				}
				if(noteElement.getAttribute("DBDNAME").equals("OLAP"))
				{
					System.out.println("Create a file name as OLAP add the data");
				}
				/*Node theTitle=noteElement.getElementsByTagName("title").item(0);
				Element titleElement=(Element)theTitle;
				System.out.println("This note is labelled:"+titleElement.getTextContent()+ "\n");
				
				
				Node theContent=noteElement.getElementsByTagName("contents").item(0);
				Element contentElement=(Element)theContent;
				System.out.println("This note's content is :"+titleElement.getTextContent()+"\n");
				*/
			}			
			
			//TARGET
			/*
			NodeList targetList=rootElement.getElementsByTagName("TARGET");
			
			for(int i=0; i<targetList.getLength();i++)
			{
				Node theNode=targetList.item(i);
				Element TargetElement=(Element)theNode;
				
				System.out.println("target name:"+TargetElement.getAttribute("NAME"));
				if(TargetElement.getAttribute("NAME").equals("WC_ARM_FA_ASSET_BALANCE_F"))
				{
					System.out.println("Create a file name as WC_ARM_FA_ASSET_BALANCE_F add the data");
					
					NodeList TargetFieldList=rootElement.getElementsByTagName("TARGETFIELD");
					for(int j=0;j<TargetFieldList.getLength();j++)
					{
						Node theTargetField=TargetElement.getElementsByTagName("TARGETFIELD").item(j);
						Element TargetFieldElement=(Element)theTargetField;
						System.out.println("Datatype :"+TargetFieldElement.getAttribute("DATATYPE")+ "\n");	
						System.out.println("Field Number :"+TargetFieldElement.getAttribute("FIELDNUMBER")+ "\n");	
						System.out.println("Key Type :"+TargetFieldElement.getAttribute("KEYTYPE")+ "\n");	
						System.out.println("Name :"+TargetFieldElement.getAttribute("NAME")+ "\n");	
						System.out.println("Nullable ?:"+TargetFieldElement.getAttribute("NULLABLE")+ "\n");	
						System.out.println("Precision :"+TargetFieldElement.getAttribute("PRECISION")+ "\n");						
					}
				}					
			}
			*/
			//TRANSFORMATION
			/*
			NodeList TransformationList=rootElement.getElementsByTagName("TRANSFORMATION");
			
			for(int i=0; i<TransformationList.getLength();i++)
			{
				Node theNode=TransformationList.item(i);
				Element TransformationElement=(Element)theNode;
				
				System.out.println("target name:"+TransformationElement.getAttribute("NAME"));
				if(TransformationElement.getAttribute("NAME").equals("LKP_W_PARAM_G_Get_ETL_PROC_WID"))
				{
					System.out.println("Create a file name as LKP_W_PARAM_G_Get_ETL_PROC_WID add the data");
					
					
					NodeList TransformFieldList=rootElement.getElementsByTagName("TRANSFORMFIELD");
					for(int j=0;j<TransformFieldList.getLength();j++)
					{
						Node theTransformField=TransformationElement.getElementsByTagName("TRANSFORMFIELD").item(j);
						Element TargetFieldElement=(Element)theTransformField;
						System.out.println("Datatype :"+TargetFieldElement.getAttribute("DATATYPE")+ "\n");							
						System.out.println("Name :"+TargetFieldElement.getAttribute("NAME")+ "\n");							
						System.out.println("Precision :"+TargetFieldElement.getAttribute("PRECISION")+ "\n");						
					}
					
					NodeList TableAttributeList=rootElement.getElementsByTagName("TABLEATTRIBUTE");
					for(int k=0;k<TableAttributeList.getLength();k++)
					{
						Node theTableAttribute=TransformationElement.getElementsByTagName("TABLEATTRIBUTE").item(k);
						Element TableAttributeElement=(Element)theTableAttribute;
						System.out.println("Name :"+TableAttributeElement.getAttribute("NAME")+ "\n");												
					}
				}					
			}			
			*/
			//MAPPLET
			
			/*
			NodeList MappletList=rootElement.getElementsByTagName("MAPPLET");
			
			for(int i=0; i<MappletList.getLength();i++)
			{
				Node theNode=MappletList.item(i);
				Element MappletElement=(Element)theNode;
				
				System.out.println("target name:"+MappletElement.getAttribute("NAME"));
				//MPLT_GET_ETL_PROC_WID
				
				if(MappletElement.getAttribute("NAME").equals("MPLT_GET_ETL_PROC_WID"))
				{
					System.out.println("Create a file name as MPLT_GET_ETL_PROC_WID add the data");
					
					NodeList TransformationList=rootElement.getElementsByTagName("TRANSFORMATION");
					for(int j=0;j<TransformationList.getLength();j++)
					{
						Node theTransformationField=MappletElement.getElementsByTagName("TRANSFORMATION").item(j);
						Element TransformationElement=(Element)theTransformationField;						
						System.out.println("Name :"+TransformationElement.getAttribute("NAME")+ "\n");							
						System.out.println("Type :"+TransformationElement.getAttribute("TYPE")+ "\n");						
					}
					
					NodeList InstanceList=rootElement.getElementsByTagName("INSTANCE");
					for(int k=0;k<InstanceList.getLength();k++)
					{
						Node theInstance=MappletElement.getElementsByTagName("INSTANCE").item(k);
						Element InstanceElement=(Element)theInstance;						
						System.out.println("Name :"+InstanceElement.getAttribute("NAME")+ "\n");							
						System.out.println("Type :"+InstanceElement.getAttribute("TYPE")+ "\n");						
					}
				}
			}
			*/
			
			//
			//MAPPING
			NodeList MappingList=rootElement.getElementsByTagName("MAPPING");
			
			for(int i=0; i<MappingList.getLength();i++)
			{
				Node theNode=MappingList.item(i);
				Element MappingElement=(Element)theNode;
				
				System.out.println("target name:"+MappingElement.getAttribute("NAME"));
				if(MappingElement.getAttribute("NAME").equals("SIL_FA_AssetBalanceFact"))
				{
					System.out.println("Create a file name as SIL_FA_AssetBalanceFact add the data");
					
					NodeList TransformationListList=rootElement.getElementsByTagName("TRANSFORMATION");
					for(int j=0;j<TransformationListList.getLength();j++)
					{
						Node theTransformationField=MappingElement.getElementsByTagName("TRANSFORMATION").item(j);
						Element TransformationElement=(Element)theTransformationField;
						System.out.println("Name :"+TransformationElement.getAttribute("NAME")+ "\n");							
						System.out.println("Type :"+TransformationElement.getAttribute("TYPE")+ "\n");											
					}
				}					
			}
			
		}
		catch(ParserConfigurationException e)
		{
			e.printStackTrace();
		}
		catch(SAXException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}