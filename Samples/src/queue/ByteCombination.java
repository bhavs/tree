package queue;

public class ByteCombination {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		float segmentLength = 5;
		byte[][] oldData={{'1','1','1','1','1'},{'2','2','2','2','2'},{'3','3','3','3','3'}};
		byte[] newData = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		byte[][] cData=combineData(oldData, newData, segmentLength);
		
		for ( int j=0;j< cData.length;j++){
			System.out.println(" "+ new String(cData[j]));
		}
		
		

	}
	
	private static byte[][] combineData(byte[][] bs, byte[] data, float segmentLen) {
		byte[][] dataS= createByteArray(data, segmentLen);
		System.out.println(" "+dataS.length+" "+ bs.length);
		byte[][] combinedData= new byte[dataS.length+bs.length][];
		int i=0;
		for( i=0;i<bs.length;i++){
			combinedData[i]=new String( bs[i]).getBytes();
		}
		int j=0;
		while( i < combinedData.length){
			combinedData[i]=new String(dataS[j]).getBytes();
			i++;
			j++;
		}
		System.out.println(" "+combinedData.length);
		return combinedData;
	}
	
	public static byte[][] createByteArray(byte[] newData, float segmentLength){
		int numOfSegments =  (int) Math.ceil((float)newData.length / segmentLength);
//		System.out.println(" "+ numOfSegments);
		byte[][] newDataSegments = new byte[numOfSegments][];
		if (newData.length % segmentLength == 0) {
			for (int i = 0; i < numOfSegments; i++) {
				newDataSegments[i] = new String(newData).substring(
						 (int) (i * segmentLength), (int)(i * segmentLength) + (int)segmentLength)
						.getBytes();
				// newDataSegments[i]=System.arraycopy(newData,
				// i*newData.length, newDataSegments[i], 0, segmentLength);
//				System.out.println(" " + new String(newDataSegments[i]));
			}

		} else {
			int remain = Math.round(newData.length % segmentLength);
			byte[] modiData = new byte[newData.length];
			System.arraycopy(newData, 0, modiData, 0, newData.length-remain);
//			System.out.println(" "+ new String(modiData));
			int i=0;
			for (i = 0; i < numOfSegments-1; i++) {
				newDataSegments[i] = new String(newData).substring(
						(int)(i * segmentLength), (int) ((i * segmentLength) + segmentLength))
						.getBytes();
				// newDataSegments[i]=System.arraycopy(newData,
				// i*newData.length, newDataSegments[i], 0, segmentLength);
//				System.out.println(" " + new String(newDataSegments[i]));
			}
			newDataSegments[i]= new String(newData).substring(newData.length-remain, newData.length).getBytes();
//			System.out.println(" "+ new String( newDataSegments[i]));
			
		}
		
		for( int j=0;j< newDataSegments.length ;j++){
			System.out.println(" "+ new String(newDataSegments[j]));
		}
		return newDataSegments;
	}
}
