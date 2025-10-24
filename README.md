# Real-Time Face Recognition

This is a **real-time face recognition system** built with Python using OpenCV and the `face_recognition` library.  
It detects faces from a webcam stream and recognizes them based on known images.

## Features
- Real-time face detection from webcam.
- Recognizes known faces and labels them.
- Displays "Unknown" for faces not in the database.

## Project Structure
```
face_recognition_project/
├── known_faces/        # Folder containing images of known people
├── main.py             # Main Python script
├── README.md           # Project description
└── requirements.txt    # Python dependencies
```

## How to Run

1. Clone the repository
2. Install dependencies: `pip install -r requirements.txt`
3. Add images inside `known_faces/` (subfolder per person)
4. Run the script: `python main.py`
5. Press `q` to quit the video stream.

## Libraries Used
- OpenCV, face_recognition, dlib, numpy
