# -*- coding: utf-8 -*-
"""
Created on Wed Oct 14 18:30:02 2026

@author: Garces
"""

import numpy as np
import tkinter as tk
from tkinter import messagebox

class Notas:
    def __init__ (self, listaNotas):
        self.listaNotas = listaNotas
    
    def promedio(self):
        return round(np.mean(self.listaNotas),1)
    
    def mayor(self):
        return max(self.listaNotas)
    
    def menor(self):
        return min(self.listaNotas)

    def desvEst(self):
        return round(np.std(self.listaNotas),1)
        

class Ventana:
    def __init__(self, root):
        self.root = root
        self.root.title("Calculadora de Promedio")
        self.root.geometry("400x400")
        self.root.config(padx=20, pady=20)
        
        tk.Label(root, text="Ingresa 5 notas")
        
        self.entradas=[]
        for i in range(5):
            tk.Label(root, text=f"Nota{i+1}:").pack(anchor="w")
            entrada = tk.Entry(root, width=25)
            entrada.pack(pady=2)
            self.entradas.append(entrada)
            
        btnCalcular = tk.Button(root, text="Calcular", command=self.procesar_notas)
        btnCalcular.pack(pady=15)
        
        btnLimpiar = tk.Button(root, text="Limpiar", command=self.limpiar_campos)
        btnLimpiar.pack(pady=15)
        
    def procesar_notas(self):
        try:
            valores = []

            for i, e in enumerate(self.entradas):
                texto = e.get().strip()
            
                if not texto:
                    raise ValueError("Campo(s) vacío(s), revise por favor")
                try:
                    valor = float(texto)
                except ValueError:
                    raise ValueError("Valor(es) no numérico(s), revise por favor")

                valores.append(valor)

            if any(nota>5.0 or nota<0.0 for nota in valores):
                raise ValueError("Nota(s) fuera de rango, revise por favor")
            
            misNotas = Notas(valores)
            
            prom = misNotas.promedio()
            mayor = misNotas.mayor()
            menor = misNotas.menor()
            desv = misNotas.desvEst()
            
            resultado = (
                f"Promedio : {prom}\n"
                f"Nota Mayor: {mayor}\n"
                f"Nota Menor: {menor}\n"
                f"Desviacion Estandar: {desv}"
                )
            messagebox.showinfo("Resultados", resultado)
        except ValueError as e:
            messagebox.showinfo("¡¡¡ERROR!!!", str(e))
            
    def limpiar_campos(self):
        for entrada in self.entradas:
            entrada.delete(0, tk.END)
            
        self.entradas[0].focus()
        
if __name__ == "__main__":
    root = tk.Tk()
    app = Ventana(root)
    root.mainloop()