//
//  ViewController.swift
//  iosApp
//
//  Created by ninehundreds on 2/1/22.
//

import UIKit
import Shared

class ViewController: UIViewController {

    @IBOutlet weak var titleLabel: UILabel!

    let apiClient = WhizApiClient()


    override func viewDidLoad() {
        super.viewDidLoad()

        titleLabel.text = Greeting().greet()
    }

    private func getAllWhizBangs() {

        Task {
           try await apiClient.getWhizBangs(success: { whizBangs in
               print("")
           }, failure: { error in
               print(error?.description ?? "unknown error")
           })
       }

    }

    private func getWhizBang(id: String) {

        Task {
            try await apiClient.getWhizBang(id: id, success: { whizBang in

            }, failure: { error in
                print(error?.description ?? "unknown error")
            })
        }
    }

    private func deleteWhizBang(id: String) {
        Task {
            try await apiClient.deleteWhizBang(id: id, success: { response in

            }, failure: { error in
                print(error?.description ?? "unknown error")
            })
        }
    }

    private func createWhizBang(code: Int, snap: String, desc: String) {

        Task {
            try await apiClient.createWhizBang(code: Int32(code), snap: snap, desc: desc, success: { whizBang in

           }, failure: { error in
               print(error?.description ?? "unknown error")
           })
       }

    }

    private func updateWhizBang(whizBang: WhizBang) {

        Task {
            try await apiClient.updateWhizBang(whizBang: whizBang, success: { whizBang in

           }, failure: { error in
               print(error?.description ?? "unknown error")
           })
       }

    }

}

