import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("Credit_card_spending.txt")

df['Gender'].value_counts().plot(kind='bar')
plt.show()

df['Card Type'].value_counts().plot(kind='bar')
plt.show()

df['City'].value_counts().head(3).plot(kind='bar')
plt.show()

df[df['Card Type']=='Signature'].groupby(df['Date'].str[:4])['Amount'].sum().plot()
plt.show()

df.groupby('Card Type')['Amount'].sum().plot(kind='pie', autopct='%1.1f%%')
plt.show()

# Output:
# All required plots displayed
