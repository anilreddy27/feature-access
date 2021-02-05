# Feature-access


# Add Feature :

    API : http://localhost:8080/feature
    Method : POST
    Request Body : 
                    {
                        "email": "test@test", 
                        "featureName": "test",
                        "enable": true
                    }
    Response : HTTP Status Code 200                
                
# Get Feature 

    API : http://localhost:8080/feature?email=test@test&featureName=test
    Method: GET   
    Response: {
                   "canAccess": true
               }             
