import face_recognition

# Face Recogniton and return results
try:
	imgOrig = face_recognition.load_image_file('FaceRecognition/Image/orginal.png')
	imgTest = face_recognition.load_image_file('FaceRecognition/Image/testing.png')
 
	encodeOrig = face_recognition.face_encodings(imgOrig)[0]
	encodeTest = face_recognition.face_encodings(imgTest)[0]
	results = face_recognition.compare_faces([encodeOrig],encodeTest)
	faceDis = face_recognition.face_distance([encodeOrig],encodeTest)
 
	print(results)
	print(faceDis)
except Exception as e:
	print('[Face Recognition Error]')
	print(e)