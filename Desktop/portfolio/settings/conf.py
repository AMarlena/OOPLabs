# Project modules
from decouple import config

# ----------------------------------------------
# Env id
#
ENV_POSSIBLE_OPTIONS = (
    "local",
    "prod",
)
ENV_ID = config("DJANGORLAR_ENV_ID", cast=str)
SECRET_KEY = "django-insecure-#85oo$#=)23j55b*)@etq1_^36^&66_-kkw#mg5@!=3q9n3s-3"